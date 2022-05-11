// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mariadb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleState Empty = new FirewallRuleState();

    /**
     * Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="endIpAddress")
    private @Nullable Output<String> endIpAddress;

    /**
     * @return Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> endIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }

    /**
     * Specifies the name of the MariaDB Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the MariaDB Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the MariaDB Server exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the MariaDB Server exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Specifies the name of the MariaDB Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return Specifies the name of the MariaDB Server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="startIpAddress")
    private @Nullable Output<String> startIpAddress;

    /**
     * @return Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> startIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }

    private FirewallRuleState() {}

    private FirewallRuleState(FirewallRuleState $) {
        this.endIpAddress = $.endIpAddress;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.startIpAddress = $.startIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleState $;

        public Builder() {
            $ = new FirewallRuleState();
        }

        public Builder(FirewallRuleState defaults) {
            $ = new FirewallRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIpAddress Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(@Nullable Output<String> endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        /**
         * @param endIpAddress Specifies the End IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(String endIpAddress) {
            return endIpAddress(Output.of(endIpAddress));
        }

        /**
         * @param name Specifies the name of the MariaDB Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the MariaDB Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the MariaDB Server exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the MariaDB Server exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName Specifies the name of the MariaDB Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName Specifies the name of the MariaDB Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param startIpAddress Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(@Nullable Output<String> startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        /**
         * @param startIpAddress Specifies the Start IP Address associated with this Firewall Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(String startIpAddress) {
            return startIpAddress(Output.of(startIpAddress));
        }

        public FirewallRuleState build() {
            return $;
        }
    }

}
