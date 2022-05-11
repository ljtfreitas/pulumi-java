// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkScopedServiceState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkScopedServiceState Empty = new PrivateLinkScopedServiceState();

    /**
     * The ID of the linked resource. It must be the Log Analytics Workspace or the Application Insights component. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="linkedResourceId")
    private @Nullable Output<String> linkedResourceId;

    /**
     * @return The ID of the linked resource. It must be the Log Analytics Workspace or the Application Insights component. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> linkedResourceId() {
        return Optional.ofNullable(this.linkedResourceId);
    }

    /**
     * The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scopeName")
    private @Nullable Output<String> scopeName;

    /**
     * @return The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> scopeName() {
        return Optional.ofNullable(this.scopeName);
    }

    private PrivateLinkScopedServiceState() {}

    private PrivateLinkScopedServiceState(PrivateLinkScopedServiceState $) {
        this.linkedResourceId = $.linkedResourceId;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkScopedServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkScopedServiceState $;

        public Builder() {
            $ = new PrivateLinkScopedServiceState();
        }

        public Builder(PrivateLinkScopedServiceState defaults) {
            $ = new PrivateLinkScopedServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedResourceId The ID of the linked resource. It must be the Log Analytics Workspace or the Application Insights component. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedResourceId(@Nullable Output<String> linkedResourceId) {
            $.linkedResourceId = linkedResourceId;
            return this;
        }

        /**
         * @param linkedResourceId The ID of the linked resource. It must be the Log Analytics Workspace or the Application Insights component. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedResourceId(String linkedResourceId) {
            return linkedResourceId(Output.of(linkedResourceId));
        }

        /**
         * @param name The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scopeName The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(@Nullable Output<String> scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        /**
         * @param scopeName The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(String scopeName) {
            return scopeName(Output.of(scopeName));
        }

        public PrivateLinkScopedServiceState build() {
            return $;
        }
    }

}
