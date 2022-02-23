// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs();

    /**
     * Number of characters after the finding to consider. Either this or window_before must be specified
     * 
     */
    @InputImport(name="windowAfter")
        private final @Nullable Input<Integer> windowAfter;

    public Input<Integer> getWindowAfter() {
        return this.windowAfter == null ? Input.empty() : this.windowAfter;
    }

    /**
     * Number of characters before the finding to consider. Either this or window_after must be specified
     * 
     */
    @InputImport(name="windowBefore")
        private final @Nullable Input<Integer> windowBefore;

    public Input<Integer> getWindowBefore() {
        return this.windowBefore == null ? Input.empty() : this.windowBefore;
    }

    public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs(
        @Nullable Input<Integer> windowAfter,
        @Nullable Input<Integer> windowBefore) {
        this.windowAfter = windowAfter;
        this.windowBefore = windowBefore;
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs() {
        this.windowAfter = Input.empty();
        this.windowBefore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> windowAfter;
        private @Nullable Input<Integer> windowBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowAfter = defaults.windowAfter;
    	      this.windowBefore = defaults.windowBefore;
        }

        public Builder setWindowAfter(@Nullable Input<Integer> windowAfter) {
            this.windowAfter = windowAfter;
            return this;
        }

        public Builder setWindowAfter(@Nullable Integer windowAfter) {
            this.windowAfter = Input.ofNullable(windowAfter);
            return this;
        }

        public Builder setWindowBefore(@Nullable Input<Integer> windowBefore) {
            this.windowBefore = windowBefore;
            return this;
        }

        public Builder setWindowBefore(@Nullable Integer windowBefore) {
            this.windowBefore = Input.ofNullable(windowBefore);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs(windowAfter, windowBefore);
        }
    }
}
