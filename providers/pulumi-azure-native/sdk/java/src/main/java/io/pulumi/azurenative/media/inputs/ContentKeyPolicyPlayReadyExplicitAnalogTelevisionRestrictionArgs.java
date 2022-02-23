// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configures the Explicit Analog Television Output Restriction control bits. For further details see the PlayReady Compliance Rules.
 * 
 */
public final class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs Empty = new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs();

    /**
     * Indicates whether this restriction is enforced on a Best Effort basis.
     * 
     */
    @InputImport(name="bestEffort", required=true)
        private final Input<Boolean> bestEffort;

    public Input<Boolean> getBestEffort() {
        return this.bestEffort;
    }

    /**
     * Configures the restriction control bits. Must be between 0 and 3 inclusive.
     * 
     */
    @InputImport(name="configurationData", required=true)
        private final Input<Integer> configurationData;

    public Input<Integer> getConfigurationData() {
        return this.configurationData;
    }

    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs(
        Input<Boolean> bestEffort,
        Input<Integer> configurationData) {
        this.bestEffort = Objects.requireNonNull(bestEffort, "expected parameter 'bestEffort' to be non-null");
        this.configurationData = Objects.requireNonNull(configurationData, "expected parameter 'configurationData' to be non-null");
    }

    private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs() {
        this.bestEffort = Input.empty();
        this.configurationData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> bestEffort;
        private Input<Integer> configurationData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bestEffort = defaults.bestEffort;
    	      this.configurationData = defaults.configurationData;
        }

        public Builder setBestEffort(Input<Boolean> bestEffort) {
            this.bestEffort = Objects.requireNonNull(bestEffort);
            return this;
        }

        public Builder setBestEffort(Boolean bestEffort) {
            this.bestEffort = Input.of(Objects.requireNonNull(bestEffort));
            return this;
        }

        public Builder setConfigurationData(Input<Integer> configurationData) {
            this.configurationData = Objects.requireNonNull(configurationData);
            return this;
        }

        public Builder setConfigurationData(Integer configurationData) {
            this.configurationData = Input.of(Objects.requireNonNull(configurationData));
            return this;
        }
        public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs build() {
            return new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionArgs(bestEffort, configurationData);
        }
    }
}
