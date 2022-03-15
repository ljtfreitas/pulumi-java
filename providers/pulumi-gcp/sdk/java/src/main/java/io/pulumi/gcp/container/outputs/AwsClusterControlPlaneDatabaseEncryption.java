// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsClusterControlPlaneDatabaseEncryption {
    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    private final String kmsKeyArn;

    @CustomType.Constructor
    private AwsClusterControlPlaneDatabaseEncryption(@CustomType.Parameter("kmsKeyArn") String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
    */
    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        public AwsClusterControlPlaneDatabaseEncryption build() {
            return new AwsClusterControlPlaneDatabaseEncryption(kmsKeyArn);
        }
    }
}
