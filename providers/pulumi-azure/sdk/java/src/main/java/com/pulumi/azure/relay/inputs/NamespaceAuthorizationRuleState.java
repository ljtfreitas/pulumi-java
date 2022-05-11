// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.relay.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceAuthorizationRuleState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceAuthorizationRuleState Empty = new NamespaceAuthorizationRuleState();

    /**
     * Grants listen access to this Authorization Rule. Defaults to `false`.
     * 
     */
    @Import(name="listen")
    private @Nullable Output<Boolean> listen;

    /**
     * @return Grants listen access to this Authorization Rule. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> listen() {
        return Optional.ofNullable(this.listen);
    }

    /**
     * Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
     * 
     */
    @Import(name="manage")
    private @Nullable Output<Boolean> manage;

    /**
     * @return Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> manage() {
        return Optional.ofNullable(this.manage);
    }

    /**
     * The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable Output<String> namespaceName;

    /**
     * @return Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
     * 
     */
    public Optional<Output<String>> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    /**
     * The Primary Connection String for the Azure Relay Namespace Authorization Rule.
     * 
     */
    @Import(name="primaryConnectionString")
    private @Nullable Output<String> primaryConnectionString;

    /**
     * @return The Primary Connection String for the Azure Relay Namespace Authorization Rule.
     * 
     */
    public Optional<Output<String>> primaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }

    /**
     * The Primary Key for the Azure Relay Namespace Authorization Rule.
     * 
     */
    @Import(name="primaryKey")
    private @Nullable Output<String> primaryKey;

    /**
     * @return The Primary Key for the Azure Relay Namespace Authorization Rule.
     * 
     */
    public Optional<Output<String>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
     * 
     */
    @Import(name="secondaryConnectionString")
    private @Nullable Output<String> secondaryConnectionString;

    /**
     * @return The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
     * 
     */
    public Optional<Output<String>> secondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }

    /**
     * The Secondary Key for the Azure Relay Namespace Authorization Rule.
     * 
     */
    @Import(name="secondaryKey")
    private @Nullable Output<String> secondaryKey;

    /**
     * @return The Secondary Key for the Azure Relay Namespace Authorization Rule.
     * 
     */
    public Optional<Output<String>> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    /**
     * Grants send access to this Authorization Rule. Defaults to `false`.
     * 
     */
    @Import(name="send")
    private @Nullable Output<Boolean> send;

    /**
     * @return Grants send access to this Authorization Rule. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> send() {
        return Optional.ofNullable(this.send);
    }

    private NamespaceAuthorizationRuleState() {}

    private NamespaceAuthorizationRuleState(NamespaceAuthorizationRuleState $) {
        this.listen = $.listen;
        this.manage = $.manage;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.primaryConnectionString = $.primaryConnectionString;
        this.primaryKey = $.primaryKey;
        this.resourceGroupName = $.resourceGroupName;
        this.secondaryConnectionString = $.secondaryConnectionString;
        this.secondaryKey = $.secondaryKey;
        this.send = $.send;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceAuthorizationRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceAuthorizationRuleState $;

        public Builder() {
            $ = new NamespaceAuthorizationRuleState();
        }

        public Builder(NamespaceAuthorizationRuleState defaults) {
            $ = new NamespaceAuthorizationRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param listen Grants listen access to this Authorization Rule. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(@Nullable Output<Boolean> listen) {
            $.listen = listen;
            return this;
        }

        /**
         * @param listen Grants listen access to this Authorization Rule. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(Boolean listen) {
            return listen(Output.of(listen));
        }

        /**
         * @param manage Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder manage(@Nullable Output<Boolean> manage) {
            $.manage = manage;
            return this;
        }

        /**
         * @param manage Grants manage access to this Authorization Rule. When this property is `true` - both `listen` and `send` must be set to `true` too. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder manage(Boolean manage) {
            return manage(Output.of(manage));
        }

        /**
         * @param name The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Azure Relay Namespace Authorization Rule. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Name of the Azure Relay Namespace for which this Azure Relay Namespace Authorization Rule will be created. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param primaryConnectionString The Primary Connection String for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(@Nullable Output<String> primaryConnectionString) {
            $.primaryConnectionString = primaryConnectionString;
            return this;
        }

        /**
         * @param primaryConnectionString The Primary Connection String for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(String primaryConnectionString) {
            return primaryConnectionString(Output.of(primaryConnectionString));
        }

        /**
         * @param primaryKey The Primary Key for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The Primary Key for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Relay Namespace Authorization Rule should exist. Changing this forces a new Azure Relay Namespace Authorization Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secondaryConnectionString The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(@Nullable Output<String> secondaryConnectionString) {
            $.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        /**
         * @param secondaryConnectionString The Secondary Connection String for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            return secondaryConnectionString(Output.of(secondaryConnectionString));
        }

        /**
         * @param secondaryKey The Secondary Key for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(@Nullable Output<String> secondaryKey) {
            $.secondaryKey = secondaryKey;
            return this;
        }

        /**
         * @param secondaryKey The Secondary Key for the Azure Relay Namespace Authorization Rule.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(String secondaryKey) {
            return secondaryKey(Output.of(secondaryKey));
        }

        /**
         * @param send Grants send access to this Authorization Rule. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(@Nullable Output<Boolean> send) {
            $.send = send;
            return this;
        }

        /**
         * @param send Grants send access to this Authorization Rule. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(Boolean send) {
            return send(Output.of(send));
        }

        public NamespaceAuthorizationRuleState build() {
            return $;
        }
    }

}
