// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningJobSignedObjectS3Args;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningJobSignedObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningJobSignedObjectArgs Empty = new SigningJobSignedObjectArgs();

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    @InputImport(name="s3s")
    private final @Nullable Input<List<SigningJobSignedObjectS3Args>> s3s;

    public Input<List<SigningJobSignedObjectS3Args>> getS3s() {
        return this.s3s == null ? Input.empty() : this.s3s;
    }

    public SigningJobSignedObjectArgs(@Nullable Input<List<SigningJobSignedObjectS3Args>> s3s) {
        this.s3s = s3s;
    }

    private SigningJobSignedObjectArgs() {
        this.s3s = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSignedObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SigningJobSignedObjectS3Args>> s3s;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSignedObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3s = defaults.s3s;
        }

        public Builder setS3s(@Nullable Input<List<SigningJobSignedObjectS3Args>> s3s) {
            this.s3s = s3s;
            return this;
        }

        public Builder setS3s(@Nullable List<SigningJobSignedObjectS3Args> s3s) {
            this.s3s = Input.ofNullable(s3s);
            return this;
        }
        public SigningJobSignedObjectArgs build() {
            return new SigningJobSignedObjectArgs(s3s);
        }
    }
}
