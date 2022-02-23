// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListWebhookEventsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWebhookEventsArgs Empty = new ListWebhookEventsArgs();

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
        private final String registryName;

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the webhook.
     * 
     */
    @InputImport(name="webhookName", required=true)
        private final String webhookName;

    public String getWebhookName() {
        return this.webhookName;
    }

    public ListWebhookEventsArgs(
        String registryName,
        String resourceGroupName,
        String webhookName) {
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.webhookName = Objects.requireNonNull(webhookName, "expected parameter 'webhookName' to be non-null");
    }

    private ListWebhookEventsArgs() {
        this.registryName = null;
        this.resourceGroupName = null;
        this.webhookName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebhookEventsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registryName;
        private String resourceGroupName;
        private String webhookName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebhookEventsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.webhookName = defaults.webhookName;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWebhookName(String webhookName) {
            this.webhookName = Objects.requireNonNull(webhookName);
            return this;
        }
        public ListWebhookEventsArgs build() {
            return new ListWebhookEventsArgs(registryName, resourceGroupName, webhookName);
        }
    }
}
