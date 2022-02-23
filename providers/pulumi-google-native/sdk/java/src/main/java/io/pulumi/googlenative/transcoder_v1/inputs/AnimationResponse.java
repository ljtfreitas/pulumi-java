// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationEndResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationFadeResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.AnimationStaticResponse;
import java.util.Objects;


/**
 * Animation types.
 * 
 */
public final class AnimationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AnimationResponse Empty = new AnimationResponse();

    /**
     * End previous animation.
     * 
     */
    @InputImport(name="animationEnd", required=true)
      private final AnimationEndResponse animationEnd;

    public AnimationEndResponse getAnimationEnd() {
        return this.animationEnd;
    }

    /**
     * Display overlay object with fade animation.
     * 
     */
    @InputImport(name="animationFade", required=true)
      private final AnimationFadeResponse animationFade;

    public AnimationFadeResponse getAnimationFade() {
        return this.animationFade;
    }

    /**
     * Display static overlay object.
     * 
     */
    @InputImport(name="animationStatic", required=true)
      private final AnimationStaticResponse animationStatic;

    public AnimationStaticResponse getAnimationStatic() {
        return this.animationStatic;
    }

    public AnimationResponse(
        AnimationEndResponse animationEnd,
        AnimationFadeResponse animationFade,
        AnimationStaticResponse animationStatic) {
        this.animationEnd = Objects.requireNonNull(animationEnd, "expected parameter 'animationEnd' to be non-null");
        this.animationFade = Objects.requireNonNull(animationFade, "expected parameter 'animationFade' to be non-null");
        this.animationStatic = Objects.requireNonNull(animationStatic, "expected parameter 'animationStatic' to be non-null");
    }

    private AnimationResponse() {
        this.animationEnd = null;
        this.animationFade = null;
        this.animationStatic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationEndResponse animationEnd;
        private AnimationFadeResponse animationFade;
        private AnimationStaticResponse animationStatic;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animationEnd = defaults.animationEnd;
    	      this.animationFade = defaults.animationFade;
    	      this.animationStatic = defaults.animationStatic;
        }

        public Builder setAnimationEnd(AnimationEndResponse animationEnd) {
            this.animationEnd = Objects.requireNonNull(animationEnd);
            return this;
        }

        public Builder setAnimationFade(AnimationFadeResponse animationFade) {
            this.animationFade = Objects.requireNonNull(animationFade);
            return this;
        }

        public Builder setAnimationStatic(AnimationStaticResponse animationStatic) {
            this.animationStatic = Objects.requireNonNull(animationStatic);
            return this;
        }
        public AnimationResponse build() {
            return new AnimationResponse(animationEnd, animationFade, animationStatic);
        }
    }
}
