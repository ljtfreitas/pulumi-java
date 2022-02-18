// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private link service connection details.
 * 
 */
public final class PrivateLinkServiceConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionArgs Empty = new PrivateLinkServiceConnectionArgs();

    /**
     * List of group IDs.
     * 
     */
    @InputImport(name="groupIds")
    private final @Nullable Input<List<String>> groupIds;

    public Input<List<String>> getGroupIds() {
        return this.groupIds == null ? Input.empty() : this.groupIds;
    }

    /**
     * Private link service connection name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Request message.
     * 
     */
    @InputImport(name="requestMessage")
    private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    public PrivateLinkServiceConnectionArgs(
        @Nullable Input<List<String>> groupIds,
        @Nullable Input<String> name,
        @Nullable Input<String> requestMessage) {
        this.groupIds = groupIds;
        this.name = name;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionArgs() {
        this.groupIds = Input.empty();
        this.name = Input.empty();
        this.requestMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groupIds;
        private @Nullable Input<String> name;
        private @Nullable Input<String> requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.name = defaults.name;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder setGroupIds(@Nullable Input<List<String>> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = Input.ofNullable(groupIds);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRequestMessage(@Nullable Input<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = Input.ofNullable(requestMessage);
            return this;
        }

        public PrivateLinkServiceConnectionArgs build() {
            return new PrivateLinkServiceConnectionArgs(groupIds, name, requestMessage);
        }
    }
}
