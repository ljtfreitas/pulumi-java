// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The ID of the Direct Connect virtual interface to accept.
     * 
     */
    @InputImport(name="virtualInterfaceId")
    private final @Nullable Input<String> virtualInterfaceId;

    public Input<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId == null ? Input.empty() : this.virtualInterfaceId;
    }

    public HostedPublicVirtualInterfaceAccepterState(
        @Nullable Input<String> arn,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> virtualInterfaceId) {
        this.arn = arn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.virtualInterfaceId = virtualInterfaceId;
    }

    private HostedPublicVirtualInterfaceAccepterState() {
        this.arn = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.virtualInterfaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedPublicVirtualInterfaceAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> virtualInterfaceId;

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

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVirtualInterfaceId(@Nullable Input<String> virtualInterfaceId) {
            this.virtualInterfaceId = virtualInterfaceId;
            return this;
        }

        public Builder setVirtualInterfaceId(@Nullable String virtualInterfaceId) {
            this.virtualInterfaceId = Input.ofNullable(virtualInterfaceId);
            return this;
        }
        public HostedPublicVirtualInterfaceAccepterState build() {
            return new HostedPublicVirtualInterfaceAccepterState(arn, tags, tagsAll, virtualInterfaceId);
        }
    }
}