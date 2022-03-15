// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationHdfsQopConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationHdfsQopConfigurationArgs Empty = new LocationHdfsQopConfigurationArgs();

    /**
     * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    @Import(name="dataTransferProtection")
      private final @Nullable Output<String> dataTransferProtection;

    public Output<String> getDataTransferProtection() {
        return this.dataTransferProtection == null ? Output.empty() : this.dataTransferProtection;
    }

    /**
     * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster. Valid values are `DISABLED`, `AUTHENTICATION`, `INTEGRITY` and `PRIVACY`.
     * 
     */
    @Import(name="rpcProtection")
      private final @Nullable Output<String> rpcProtection;

    public Output<String> getRpcProtection() {
        return this.rpcProtection == null ? Output.empty() : this.rpcProtection;
    }

    public LocationHdfsQopConfigurationArgs(
        @Nullable Output<String> dataTransferProtection,
        @Nullable Output<String> rpcProtection) {
        this.dataTransferProtection = dataTransferProtection;
        this.rpcProtection = rpcProtection;
    }

    private LocationHdfsQopConfigurationArgs() {
        this.dataTransferProtection = Output.empty();
        this.rpcProtection = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsQopConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataTransferProtection;
        private @Nullable Output<String> rpcProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsQopConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTransferProtection = defaults.dataTransferProtection;
    	      this.rpcProtection = defaults.rpcProtection;
        }

        public Builder dataTransferProtection(@Nullable Output<String> dataTransferProtection) {
            this.dataTransferProtection = dataTransferProtection;
            return this;
        }

        public Builder dataTransferProtection(@Nullable String dataTransferProtection) {
            this.dataTransferProtection = Output.ofNullable(dataTransferProtection);
            return this;
        }

        public Builder rpcProtection(@Nullable Output<String> rpcProtection) {
            this.rpcProtection = rpcProtection;
            return this;
        }

        public Builder rpcProtection(@Nullable String rpcProtection) {
            this.rpcProtection = Output.ofNullable(rpcProtection);
            return this;
        }
        public LocationHdfsQopConfigurationArgs build() {
            return new LocationHdfsQopConfigurationArgs(dataTransferProtection, rpcProtection);
        }
    }
}
