// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Advanced API Ops add-on.
 * 
 */
public final class GoogleCloudApigeeV1AdvancedApiOpsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1AdvancedApiOpsConfigArgs Empty = new GoogleCloudApigeeV1AdvancedApiOpsConfigArgs();

    /**
     * Flag that specifies whether the Advanced API Ops add-on is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public GoogleCloudApigeeV1AdvancedApiOpsConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private GoogleCloudApigeeV1AdvancedApiOpsConfigArgs() {
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AdvancedApiOpsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AdvancedApiOpsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public GoogleCloudApigeeV1AdvancedApiOpsConfigArgs build() {
            return new GoogleCloudApigeeV1AdvancedApiOpsConfigArgs(enabled);
        }
    }
}
