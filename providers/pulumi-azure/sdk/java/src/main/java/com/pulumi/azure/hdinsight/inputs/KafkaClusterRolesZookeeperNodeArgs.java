// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaClusterRolesZookeeperNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaClusterRolesZookeeperNodeArgs Empty = new KafkaClusterRolesZookeeperNodeArgs();

    /**
     * The Password associated with the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The Password associated with the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * A list of SSH Keys which should be used for the local administrator on the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sshKeys")
    private @Nullable Output<List<String>> sshKeys;

    /**
     * @return A list of SSH Keys which should be used for the local administrator on the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<String>>> sshKeys() {
        return Optional.ofNullable(this.sshKeys);
    }

    /**
     * The ID of the Subnet within the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet within the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The Username of the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The Username of the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * The ID of the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<String> virtualNetworkId;

    /**
     * @return The ID of the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    /**
     * The Size of the Virtual Machine which should be used as the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="vmSize", required=true)
    private Output<String> vmSize;

    /**
     * @return The Size of the Virtual Machine which should be used as the Zookeeper Nodes. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vmSize() {
        return this.vmSize;
    }

    private KafkaClusterRolesZookeeperNodeArgs() {}

    private KafkaClusterRolesZookeeperNodeArgs(KafkaClusterRolesZookeeperNodeArgs $) {
        this.password = $.password;
        this.sshKeys = $.sshKeys;
        this.subnetId = $.subnetId;
        this.username = $.username;
        this.virtualNetworkId = $.virtualNetworkId;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaClusterRolesZookeeperNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaClusterRolesZookeeperNodeArgs $;

        public Builder() {
            $ = new KafkaClusterRolesZookeeperNodeArgs();
        }

        public Builder(KafkaClusterRolesZookeeperNodeArgs defaults) {
            $ = new KafkaClusterRolesZookeeperNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The Password associated with the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The Password associated with the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param sshKeys A list of SSH Keys which should be used for the local administrator on the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(@Nullable Output<List<String>> sshKeys) {
            $.sshKeys = sshKeys;
            return this;
        }

        /**
         * @param sshKeys A list of SSH Keys which should be used for the local administrator on the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(List<String> sshKeys) {
            return sshKeys(Output.of(sshKeys));
        }

        /**
         * @param sshKeys A list of SSH Keys which should be used for the local administrator on the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sshKeys(String... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }

        /**
         * @param subnetId The ID of the Subnet within the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet within the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param username The Username of the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The Username of the local administrator for the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param virtualNetworkId The ID of the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(@Nullable Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId The ID of the Virtual Network where the Zookeeper Nodes should be provisioned within. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        /**
         * @param vmSize The Size of the Virtual Machine which should be used as the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(Output<String> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        /**
         * @param vmSize The Size of the Virtual Machine which should be used as the Zookeeper Nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(String vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public KafkaClusterRolesZookeeperNodeArgs build() {
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            $.vmSize = Objects.requireNonNull($.vmSize, "expected parameter 'vmSize' to be non-null");
            return $;
        }
    }

}
