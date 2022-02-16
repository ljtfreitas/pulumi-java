// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AwsClusterControlPlaneConfigEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneConfigEncryptionArgs Empty = new AwsClusterControlPlaneConfigEncryptionArgs();

    @InputImport(name="kmsKeyArn", required=true)
    private final Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public AwsClusterControlPlaneConfigEncryptionArgs(Input<String> kmsKeyArn) {
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
    }

    private AwsClusterControlPlaneConfigEncryptionArgs() {
        this.kmsKeyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneConfigEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneConfigEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setKmsKeyArn(Input<String> kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }

        public Builder setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Input.of(Objects.requireNonNull(kmsKeyArn));
            return this;
        }

        public AwsClusterControlPlaneConfigEncryptionArgs build() {
            return new AwsClusterControlPlaneConfigEncryptionArgs(kmsKeyArn);
        }
    }
}