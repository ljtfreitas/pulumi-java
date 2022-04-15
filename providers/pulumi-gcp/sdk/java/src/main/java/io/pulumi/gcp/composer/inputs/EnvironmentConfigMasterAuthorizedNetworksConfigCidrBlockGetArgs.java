// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs Empty = new EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs();

    @Import(name="cidrBlock", required=true)
      private final Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    public EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs(
        Output<String> cidrBlock,
        @Nullable Output<String> displayName) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.displayName = displayName;
    }

    private EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs() {
        this.cidrBlock = Codegen.empty();
        this.displayName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cidrBlock;
        private @Nullable Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.displayName = defaults.displayName;
        }

        public Builder cidrBlock(Output<String> cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Output.of(Objects.requireNonNull(cidrBlock));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }        public EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs build() {
            return new EnvironmentConfigMasterAuthorizedNetworksConfigCidrBlockGetArgs(cidrBlock, displayName);
        }
    }
}
