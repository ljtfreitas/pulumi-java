// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedPublicVirtualInterfaceAccepterState extends io.pulumi.resources.ResourceArgs {

    public static final HostedPublicVirtualInterfaceAccepterState Empty = new HostedPublicVirtualInterfaceAccepterState();

    /**
     * The ARN of the virtual interface.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
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

    /**
     * The ID of the Direct Connect virtual interface to accept.
     * 
     */
    @Import(name="virtualInterfaceId")
      private final @Nullable Output<String> virtualInterfaceId;

    public Output<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId == null ? Output.empty() : this.virtualInterfaceId;
    }

    public HostedPublicVirtualInterfaceAccepterState(
        @Nullable Output<String> arn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> virtualInterfaceId) {
        this.arn = arn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.virtualInterfaceId = virtualInterfaceId;
    }

    private HostedPublicVirtualInterfaceAccepterState() {
        this.arn = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.virtualInterfaceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedPublicVirtualInterfaceAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> virtualInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedPublicVirtualInterfaceAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.virtualInterfaceId = defaults.virtualInterfaceId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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

        public Builder virtualInterfaceId(@Nullable Output<String> virtualInterfaceId) {
            this.virtualInterfaceId = virtualInterfaceId;
            return this;
        }

        public Builder virtualInterfaceId(@Nullable String virtualInterfaceId) {
            this.virtualInterfaceId = Output.ofNullable(virtualInterfaceId);
            return this;
        }
        public HostedPublicVirtualInterfaceAccepterState build() {
            return new HostedPublicVirtualInterfaceAccepterState(arn, tags, tagsAll, virtualInterfaceId);
        }
    }
}
