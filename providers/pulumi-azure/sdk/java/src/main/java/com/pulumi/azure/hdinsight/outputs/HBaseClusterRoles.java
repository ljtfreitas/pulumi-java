// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.HBaseClusterRolesHeadNode;
import com.pulumi.azure.hdinsight.outputs.HBaseClusterRolesWorkerNode;
import com.pulumi.azure.hdinsight.outputs.HBaseClusterRolesZookeeperNode;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class HBaseClusterRoles {
    /**
     * @return A `head_node` block as defined above.
     * 
     */
    private final HBaseClusterRolesHeadNode headNode;
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    private final HBaseClusterRolesWorkerNode workerNode;
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    private final HBaseClusterRolesZookeeperNode zookeeperNode;

    @CustomType.Constructor
    private HBaseClusterRoles(
        @CustomType.Parameter("headNode") HBaseClusterRolesHeadNode headNode,
        @CustomType.Parameter("workerNode") HBaseClusterRolesWorkerNode workerNode,
        @CustomType.Parameter("zookeeperNode") HBaseClusterRolesZookeeperNode zookeeperNode) {
        this.headNode = headNode;
        this.workerNode = workerNode;
        this.zookeeperNode = zookeeperNode;
    }

    /**
     * @return A `head_node` block as defined above.
     * 
     */
    public HBaseClusterRolesHeadNode headNode() {
        return this.headNode;
    }
    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    public HBaseClusterRolesWorkerNode workerNode() {
        return this.workerNode;
    }
    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    public HBaseClusterRolesZookeeperNode zookeeperNode() {
        return this.zookeeperNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HBaseClusterRoles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HBaseClusterRolesHeadNode headNode;
        private HBaseClusterRolesWorkerNode workerNode;
        private HBaseClusterRolesZookeeperNode zookeeperNode;

        public Builder() {
    	      // Empty
        }

        public Builder(HBaseClusterRoles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headNode = defaults.headNode;
    	      this.workerNode = defaults.workerNode;
    	      this.zookeeperNode = defaults.zookeeperNode;
        }

        public Builder headNode(HBaseClusterRolesHeadNode headNode) {
            this.headNode = Objects.requireNonNull(headNode);
            return this;
        }
        public Builder workerNode(HBaseClusterRolesWorkerNode workerNode) {
            this.workerNode = Objects.requireNonNull(workerNode);
            return this;
        }
        public Builder zookeeperNode(HBaseClusterRolesZookeeperNode zookeeperNode) {
            this.zookeeperNode = Objects.requireNonNull(zookeeperNode);
            return this;
        }        public HBaseClusterRoles build() {
            return new HBaseClusterRoles(headNode, workerNode, zookeeperNode);
        }
    }
}
