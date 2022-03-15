// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Python2PackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final Python2PackageArgs Empty = new Python2PackageArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the module content link.
     * 
     */
    @Import(name="contentLink", required=true)
      private final Output<ContentLinkArgs> contentLink;

    public Output<ContentLinkArgs> getContentLink() {
        return this.contentLink;
    }

    /**
     * The name of python package.
     * 
     */
    @Import(name="packageName")
      private final @Nullable Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName == null ? Output.empty() : this.packageName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public Python2PackageArgs(
        Output<String> automationAccountName,
        Output<ContentLinkArgs> contentLink,
        @Nullable Output<String> packageName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.contentLink = Objects.requireNonNull(contentLink, "expected parameter 'contentLink' to be non-null");
        this.packageName = packageName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private Python2PackageArgs() {
        this.automationAccountName = Output.empty();
        this.contentLink = Output.empty();
        this.packageName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Python2PackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private Output<ContentLinkArgs> contentLink;
        private @Nullable Output<String> packageName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(Python2PackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.contentLink = defaults.contentLink;
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder contentLink(Output<ContentLinkArgs> contentLink) {
            this.contentLink = Objects.requireNonNull(contentLink);
            return this;
        }

        public Builder contentLink(ContentLinkArgs contentLink) {
            this.contentLink = Output.of(Objects.requireNonNull(contentLink));
            return this;
        }

        public Builder packageName(@Nullable Output<String> packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder packageName(@Nullable String packageName) {
            this.packageName = Output.ofNullable(packageName);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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
        public Python2PackageArgs build() {
            return new Python2PackageArgs(automationAccountName, contentLink, packageName, resourceGroupName, tags);
        }
    }
}
