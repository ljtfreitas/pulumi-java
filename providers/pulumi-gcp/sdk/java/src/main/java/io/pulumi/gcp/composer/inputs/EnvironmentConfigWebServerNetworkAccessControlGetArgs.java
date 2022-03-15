// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.composer.inputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigWebServerNetworkAccessControlGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigWebServerNetworkAccessControlGetArgs Empty = new EnvironmentConfigWebServerNetworkAccessControlGetArgs();

    @Import(name="allowedIpRanges")
      private final @Nullable Output<List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs>> allowedIpRanges;

    public Output<List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs>> getAllowedIpRanges() {
        return this.allowedIpRanges == null ? Output.empty() : this.allowedIpRanges;
    }

    public EnvironmentConfigWebServerNetworkAccessControlGetArgs(@Nullable Output<List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs>> allowedIpRanges) {
        this.allowedIpRanges = allowedIpRanges;
    }

    private EnvironmentConfigWebServerNetworkAccessControlGetArgs() {
        this.allowedIpRanges = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWebServerNetworkAccessControlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs>> allowedIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWebServerNetworkAccessControlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRanges = defaults.allowedIpRanges;
        }

        public Builder allowedIpRanges(@Nullable Output<List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs>> allowedIpRanges) {
            this.allowedIpRanges = allowedIpRanges;
            return this;
        }

        public Builder allowedIpRanges(@Nullable List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRangeGetArgs> allowedIpRanges) {
            this.allowedIpRanges = Output.ofNullable(allowedIpRanges);
            return this;
        }
        public EnvironmentConfigWebServerNetworkAccessControlGetArgs build() {
            return new EnvironmentConfigWebServerNetworkAccessControlGetArgs(allowedIpRanges);
        }
    }
}
