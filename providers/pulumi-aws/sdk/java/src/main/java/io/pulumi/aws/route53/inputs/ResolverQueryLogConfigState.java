// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverQueryLogConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ResolverQueryLogConfigState Empty = new ResolverQueryLogConfigState();

    /**
     * The ARN (Amazon Resource Name) of the Route 53 Resolver query logging configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The ARN of the resource that you want Route 53 Resolver to send query logs.
     * You can send query logs to an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
     * 
     */
    @Import(name="destinationArn")
      private final @Nullable Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn == null ? Output.empty() : this.destinationArn;
    }

    /**
     * The name of the Route 53 Resolver query logging configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The AWS account ID of the account that created the query logging configuration.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account.
     * Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @Import(name="shareStatus")
      private final @Nullable Output<String> shareStatus;

    public Output<String> getShareStatus() {
        return this.shareStatus == null ? Output.empty() : this.shareStatus;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ResolverQueryLogConfigState(
        @Nullable Output<String> arn,
        @Nullable Output<String> destinationArn,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> shareStatus,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.destinationArn = destinationArn;
        this.name = name;
        this.ownerId = ownerId;
        this.shareStatus = shareStatus;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ResolverQueryLogConfigState() {
        this.arn = Output.empty();
        this.destinationArn = Output.empty();
        this.name = Output.empty();
        this.ownerId = Output.empty();
        this.shareStatus = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverQueryLogConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> destinationArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> shareStatus;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverQueryLogConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destinationArn = defaults.destinationArn;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.shareStatus = defaults.shareStatus;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder destinationArn(@Nullable Output<String> destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        public Builder destinationArn(@Nullable String destinationArn) {
            this.destinationArn = Output.ofNullable(destinationArn);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }

        public Builder shareStatus(@Nullable Output<String> shareStatus) {
            this.shareStatus = shareStatus;
            return this;
        }

        public Builder shareStatus(@Nullable String shareStatus) {
            this.shareStatus = Output.ofNullable(shareStatus);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public ResolverQueryLogConfigState build() {
            return new ResolverQueryLogConfigState(arn, destinationArn, name, ownerId, shareStatus, tags, tagsAll);
        }
    }
}
