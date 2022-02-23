// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.media.inputs.ContentKeyPolicyOptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContentKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyArgs Empty = new ContentKeyPolicyArgs();

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The Content Key Policy name.
     * 
     */
    @InputImport(name="contentKeyPolicyName")
        private final @Nullable Input<String> contentKeyPolicyName;

    public Input<String> getContentKeyPolicyName() {
        return this.contentKeyPolicyName == null ? Input.empty() : this.contentKeyPolicyName;
    }

    /**
     * A description for the Policy.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Key Policy options.
     * 
     */
    @InputImport(name="options", required=true)
        private final Input<List<ContentKeyPolicyOptionArgs>> options;

    public Input<List<ContentKeyPolicyOptionArgs>> getOptions() {
        return this.options;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ContentKeyPolicyArgs(
        Input<String> accountName,
        @Nullable Input<String> contentKeyPolicyName,
        @Nullable Input<String> description,
        Input<List<ContentKeyPolicyOptionArgs>> options,
        Input<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.contentKeyPolicyName = contentKeyPolicyName;
        this.description = description;
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ContentKeyPolicyArgs() {
        this.accountName = Input.empty();
        this.contentKeyPolicyName = Input.empty();
        this.description = Input.empty();
        this.options = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> contentKeyPolicyName;
        private @Nullable Input<String> description;
        private Input<List<ContentKeyPolicyOptionArgs>> options;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.contentKeyPolicyName = defaults.contentKeyPolicyName;
    	      this.description = defaults.description;
    	      this.options = defaults.options;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setContentKeyPolicyName(@Nullable Input<String> contentKeyPolicyName) {
            this.contentKeyPolicyName = contentKeyPolicyName;
            return this;
        }

        public Builder setContentKeyPolicyName(@Nullable String contentKeyPolicyName) {
            this.contentKeyPolicyName = Input.ofNullable(contentKeyPolicyName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setOptions(Input<List<ContentKeyPolicyOptionArgs>> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setOptions(List<ContentKeyPolicyOptionArgs> options) {
            this.options = Input.of(Objects.requireNonNull(options));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public ContentKeyPolicyArgs build() {
            return new ContentKeyPolicyArgs(accountName, contentKeyPolicyName, description, options, resourceGroupName);
        }
    }
}
