// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify properties of default content key for each encryption scheme
 * 
 */
public final class DefaultKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultKeyArgs Empty = new DefaultKeyArgs();

    /**
     * Label can be used to specify Content Key when creating a Streaming Locator
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    /**
     * Policy used by Default Key
     * 
     */
    @Import(name="policyName")
      private final @Nullable Output<String> policyName;

    public Output<String> getPolicyName() {
        return this.policyName == null ? Output.empty() : this.policyName;
    }

    public DefaultKeyArgs(
        @Nullable Output<String> label,
        @Nullable Output<String> policyName) {
        this.label = label;
        this.policyName = policyName;
    }

    private DefaultKeyArgs() {
        this.label = Output.empty();
        this.policyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> label;
        private @Nullable Output<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.policyName = defaults.policyName;
        }

        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }

        public Builder label(@Nullable String label) {
            this.label = Output.ofNullable(label);
            return this;
        }

        public Builder policyName(@Nullable Output<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder policyName(@Nullable String policyName) {
            this.policyName = Output.ofNullable(policyName);
            return this;
        }
        public DefaultKeyArgs build() {
            return new DefaultKeyArgs(label, policyName);
        }
    }
}
