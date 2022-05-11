// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeArgs;
import com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class HBaseClusterRolesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HBaseClusterRolesArgs Empty = new HBaseClusterRolesArgs();

    /**
     * A `head_node` block as defined above.
     * 
     */
    @Import(name="headNode", required=true)
    private Output<HBaseClusterRolesHeadNodeArgs> headNode;

    /**
     * @return A `head_node` block as defined above.
     * 
     */
    public Output<HBaseClusterRolesHeadNodeArgs> headNode() {
        return this.headNode;
    }

    /**
     * A `worker_node` block as defined below.
     * 
     */
    @Import(name="workerNode", required=true)
    private Output<HBaseClusterRolesWorkerNodeArgs> workerNode;

    /**
     * @return A `worker_node` block as defined below.
     * 
     */
    public Output<HBaseClusterRolesWorkerNodeArgs> workerNode() {
        return this.workerNode;
    }

    /**
     * A `zookeeper_node` block as defined below.
     * 
     */
    @Import(name="zookeeperNode", required=true)
    private Output<HBaseClusterRolesZookeeperNodeArgs> zookeeperNode;

    /**
     * @return A `zookeeper_node` block as defined below.
     * 
     */
    public Output<HBaseClusterRolesZookeeperNodeArgs> zookeeperNode() {
        return this.zookeeperNode;
    }

    private HBaseClusterRolesArgs() {}

    private HBaseClusterRolesArgs(HBaseClusterRolesArgs $) {
        this.headNode = $.headNode;
        this.workerNode = $.workerNode;
        this.zookeeperNode = $.zookeeperNode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HBaseClusterRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HBaseClusterRolesArgs $;

        public Builder() {
            $ = new HBaseClusterRolesArgs();
        }

        public Builder(HBaseClusterRolesArgs defaults) {
            $ = new HBaseClusterRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headNode A `head_node` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder headNode(Output<HBaseClusterRolesHeadNodeArgs> headNode) {
            $.headNode = headNode;
            return this;
        }

        /**
         * @param headNode A `head_node` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder headNode(HBaseClusterRolesHeadNodeArgs headNode) {
            return headNode(Output.of(headNode));
        }

        /**
         * @param workerNode A `worker_node` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder workerNode(Output<HBaseClusterRolesWorkerNodeArgs> workerNode) {
            $.workerNode = workerNode;
            return this;
        }

        /**
         * @param workerNode A `worker_node` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder workerNode(HBaseClusterRolesWorkerNodeArgs workerNode) {
            return workerNode(Output.of(workerNode));
        }

        /**
         * @param zookeeperNode A `zookeeper_node` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder zookeeperNode(Output<HBaseClusterRolesZookeeperNodeArgs> zookeeperNode) {
            $.zookeeperNode = zookeeperNode;
            return this;
        }

        /**
         * @param zookeeperNode A `zookeeper_node` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder zookeeperNode(HBaseClusterRolesZookeeperNodeArgs zookeeperNode) {
            return zookeeperNode(Output.of(zookeeperNode));
        }

        public HBaseClusterRolesArgs build() {
            $.headNode = Objects.requireNonNull($.headNode, "expected parameter 'headNode' to be non-null");
            $.workerNode = Objects.requireNonNull($.workerNode, "expected parameter 'workerNode' to be non-null");
            $.zookeeperNode = Objects.requireNonNull($.zookeeperNode, "expected parameter 'zookeeperNode' to be non-null");
            return $;
        }
    }

}
