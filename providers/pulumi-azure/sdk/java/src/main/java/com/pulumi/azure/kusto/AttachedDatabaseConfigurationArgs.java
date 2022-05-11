// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto;

import com.pulumi.azure.kusto.inputs.AttachedDatabaseConfigurationSharingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AttachedDatabaseConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedDatabaseConfigurationArgs Empty = new AttachedDatabaseConfigurationArgs();

    /**
     * Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The resource id of the cluster where the databases you would like to attach reside.
     * 
     */
    @Import(name="clusterResourceId", required=true)
    private Output<String> clusterResourceId;

    /**
     * @return The resource id of the cluster where the databases you would like to attach reside.
     * 
     */
    public Output<String> clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`.
     * 
     */
    @Import(name="defaultPrincipalModificationKind")
    private @Nullable Output<String> defaultPrincipalModificationKind;

    /**
     * @return The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`.
     * 
     */
    public Optional<Output<String>> defaultPrincipalModificationKind() {
        return Optional.ofNullable(this.defaultPrincipalModificationKind);
    }

    /**
     * Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `sharing` block as defined below.
     * 
     */
    @Import(name="sharing")
    private @Nullable Output<AttachedDatabaseConfigurationSharingArgs> sharing;

    /**
     * @return A `sharing` block as defined below.
     * 
     */
    public Optional<Output<AttachedDatabaseConfigurationSharingArgs>> sharing() {
        return Optional.ofNullable(this.sharing);
    }

    private AttachedDatabaseConfigurationArgs() {}

    private AttachedDatabaseConfigurationArgs(AttachedDatabaseConfigurationArgs $) {
        this.clusterName = $.clusterName;
        this.clusterResourceId = $.clusterResourceId;
        this.databaseName = $.databaseName;
        this.defaultPrincipalModificationKind = $.defaultPrincipalModificationKind;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sharing = $.sharing;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedDatabaseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedDatabaseConfigurationArgs $;

        public Builder() {
            $ = new AttachedDatabaseConfigurationArgs();
        }

        public Builder(AttachedDatabaseConfigurationArgs defaults) {
            $ = new AttachedDatabaseConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Specifies the name of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterResourceId The resource id of the cluster where the databases you would like to attach reside.
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceId(Output<String> clusterResourceId) {
            $.clusterResourceId = clusterResourceId;
            return this;
        }

        /**
         * @param clusterResourceId The resource id of the cluster where the databases you would like to attach reside.
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceId(String clusterResourceId) {
            return clusterResourceId(Output.of(clusterResourceId));
        }

        /**
         * @param databaseName The name of the database which you would like to attach, use * if you want to follow all current and future databases.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database which you would like to attach, use * if you want to follow all current and future databases.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param defaultPrincipalModificationKind The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`.
         * 
         * @return builder
         * 
         */
        public Builder defaultPrincipalModificationKind(@Nullable Output<String> defaultPrincipalModificationKind) {
            $.defaultPrincipalModificationKind = defaultPrincipalModificationKind;
            return this;
        }

        /**
         * @param defaultPrincipalModificationKind The default principals modification kind. Valid values are: `None` (default), `Replace` and `Union`.
         * 
         * @return builder
         * 
         */
        public Builder defaultPrincipalModificationKind(String defaultPrincipalModificationKind) {
            return defaultPrincipalModificationKind(Output.of(defaultPrincipalModificationKind));
        }

        /**
         * @param location Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the location of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Kusto Attached Database Configuration to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the resource group of the Kusto Cluster for which the configuration will be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sharing A `sharing` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sharing(@Nullable Output<AttachedDatabaseConfigurationSharingArgs> sharing) {
            $.sharing = sharing;
            return this;
        }

        /**
         * @param sharing A `sharing` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sharing(AttachedDatabaseConfigurationSharingArgs sharing) {
            return sharing(Output.of(sharing));
        }

        public AttachedDatabaseConfigurationArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.clusterResourceId = Objects.requireNonNull($.clusterResourceId, "expected parameter 'clusterResourceId' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
