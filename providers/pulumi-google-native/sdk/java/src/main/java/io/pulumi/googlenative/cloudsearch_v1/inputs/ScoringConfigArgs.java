// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scoring configurations for a source while processing a Search or Suggest request.
 * 
 */
public final class ScoringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScoringConfigArgs Empty = new ScoringConfigArgs();

    /**
     * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI.
     * 
     */
    @InputImport(name="disableFreshness")
      private final @Nullable Input<Boolean> disableFreshness;

    public Input<Boolean> getDisableFreshness() {
        return this.disableFreshness == null ? Input.empty() : this.disableFreshness;
    }

    /**
     * Whether to personalize the results. By default, personal signals will be used to boost results.
     * 
     */
    @InputImport(name="disablePersonalization")
      private final @Nullable Input<Boolean> disablePersonalization;

    public Input<Boolean> getDisablePersonalization() {
        return this.disablePersonalization == null ? Input.empty() : this.disablePersonalization;
    }

    public ScoringConfigArgs(
        @Nullable Input<Boolean> disableFreshness,
        @Nullable Input<Boolean> disablePersonalization) {
        this.disableFreshness = disableFreshness;
        this.disablePersonalization = disablePersonalization;
    }

    private ScoringConfigArgs() {
        this.disableFreshness = Input.empty();
        this.disablePersonalization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableFreshness;
        private @Nullable Input<Boolean> disablePersonalization;

        public Builder() {
    	      // Empty
        }

        public Builder(ScoringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFreshness = defaults.disableFreshness;
    	      this.disablePersonalization = defaults.disablePersonalization;
        }

        public Builder setDisableFreshness(@Nullable Input<Boolean> disableFreshness) {
            this.disableFreshness = disableFreshness;
            return this;
        }

        public Builder setDisableFreshness(@Nullable Boolean disableFreshness) {
            this.disableFreshness = Input.ofNullable(disableFreshness);
            return this;
        }

        public Builder setDisablePersonalization(@Nullable Input<Boolean> disablePersonalization) {
            this.disablePersonalization = disablePersonalization;
            return this;
        }

        public Builder setDisablePersonalization(@Nullable Boolean disablePersonalization) {
            this.disablePersonalization = Input.ofNullable(disablePersonalization);
            return this;
        }
        public ScoringConfigArgs build() {
            return new ScoringConfigArgs(disableFreshness, disablePersonalization);
        }
    }
}
