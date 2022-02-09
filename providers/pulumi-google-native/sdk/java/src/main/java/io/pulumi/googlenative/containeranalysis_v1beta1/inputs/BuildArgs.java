// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.BuildSignatureArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildArgs Empty = new BuildArgs();

    @InputImport(name="builderVersion", required=true)
    private final Input<String> builderVersion;

    public Input<String> getBuilderVersion() {
        return this.builderVersion;
    }

    @InputImport(name="signature")
    private final @Nullable Input<BuildSignatureArgs> signature;

    public Input<BuildSignatureArgs> getSignature() {
        return this.signature == null ? Input.empty() : this.signature;
    }

    public BuildArgs(
        Input<String> builderVersion,
        @Nullable Input<BuildSignatureArgs> signature) {
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
        this.signature = signature;
    }

    private BuildArgs() {
        this.builderVersion = Input.empty();
        this.signature = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> builderVersion;
        private @Nullable Input<BuildSignatureArgs> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder setBuilderVersion(Input<String> builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public Builder setBuilderVersion(String builderVersion) {
            this.builderVersion = Input.of(Objects.requireNonNull(builderVersion));
            return this;
        }

        public Builder setSignature(@Nullable Input<BuildSignatureArgs> signature) {
            this.signature = signature;
            return this;
        }

        public Builder setSignature(@Nullable BuildSignatureArgs signature) {
            this.signature = Input.ofNullable(signature);
            return this;
        }

        public BuildArgs build() {
            return new BuildArgs(builderVersion, signature);
        }
    }
}