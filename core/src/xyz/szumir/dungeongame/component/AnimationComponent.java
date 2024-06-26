package xyz.szumir.dungeongame.component;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import lombok.Setter;
import xyz.szumir.dungeongame.helper.Anim;

import java.util.HashMap;

@Setter
public class AnimationComponent implements Component {
    private HashMap<AnimationType, Anim> animations = new HashMap<>();
    private AnimationType currentAnimation = AnimationType.IDLE;
    public float state = 0;

    public void update(float deltaTime) {
        state += deltaTime;
    }
    public Anim getCurrentAnimation() {
        return animations.get(currentAnimation);
    }
    public void addAnimation(AnimationType animationType, Anim anim) { this.animations.put(animationType, anim); }

    public enum AnimationType {
        IDLE, WALK;
    }

}
