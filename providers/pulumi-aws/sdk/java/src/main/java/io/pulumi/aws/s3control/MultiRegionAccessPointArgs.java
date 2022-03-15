// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointArgs Empty = new MultiRegionAccessPointArgs();

    /**
     * The AWS account ID for the owner of the buckets for which you want to create a Multi-Region Access Point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * A configuration block containing details about the Multi-Region Access Point. See Details Configuration Block below for more details
     * 
     */
    @Import(name="details", required=true)
      private final Output<MultiRegionAccessPointDetailsArgs> details;

    public Output<MultiRegionAccessPointDetailsArgs> getDetails() {
        return this.details;
    }

    public MultiRegionAccessPointArgs(
        @Nullable Output<String> accountId,
        Output<MultiRegionAccessPointDetailsArgs> details) {
        this.accountId = accountId;
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
    }

    private MultiRegionAccessPointArgs() {
        this.accountId = Output.empty();
        this.details = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private Output<MultiRegionAccessPointDetailsArgs> details;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.details = defaults.details;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
            return this;
        }

        public Builder details(Output<MultiRegionAccessPointDetailsArgs> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder details(MultiRegionAccessPointDetailsArgs details) {
            this.details = Output.of(Objects.requireNonNull(details));
            return this;
        }
        public MultiRegionAccessPointArgs build() {
            return new MultiRegionAccessPointArgs(accountId, details);
        }
    }
}
