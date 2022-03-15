// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobSourceS3Args;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class SigningJobSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobSourceArgs Empty = new SigningJobSourceArgs();

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    @Import(name="s3", required=true)
      private final Output<SigningJobSourceS3Args> s3;

    public Output<SigningJobSourceS3Args> getS3() {
        return this.s3;
    }

    public SigningJobSourceArgs(Output<SigningJobSourceS3Args> s3) {
        this.s3 = Objects.requireNonNull(s3, "expected parameter 's3' to be non-null");
    }

    private SigningJobSourceArgs() {
        this.s3 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SigningJobSourceS3Args> s3;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder s3(Output<SigningJobSourceS3Args> s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }

        public Builder s3(SigningJobSourceS3Args s3) {
            this.s3 = Output.of(Objects.requireNonNull(s3));
            return this;
        }
        public SigningJobSourceArgs build() {
            return new SigningJobSourceArgs(s3);
        }
    }
}
