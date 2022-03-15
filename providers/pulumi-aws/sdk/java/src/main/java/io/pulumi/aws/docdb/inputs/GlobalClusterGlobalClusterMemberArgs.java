// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalClusterGlobalClusterMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalClusterGlobalClusterMemberArgs Empty = new GlobalClusterGlobalClusterMemberArgs();

    /**
     * Amazon Resource Name (ARN) of member DB Cluster.
     * 
     */
    @Import(name="dbClusterArn")
      private final @Nullable Output<String> dbClusterArn;

    public Output<String> getDbClusterArn() {
        return this.dbClusterArn == null ? Output.empty() : this.dbClusterArn;
    }

    /**
     * Whether the member is the primary DB Cluster.
     * 
     */
    @Import(name="isWriter")
      private final @Nullable Output<Boolean> isWriter;

    public Output<Boolean> getIsWriter() {
        return this.isWriter == null ? Output.empty() : this.isWriter;
    }

    public GlobalClusterGlobalClusterMemberArgs(
        @Nullable Output<String> dbClusterArn,
        @Nullable Output<Boolean> isWriter) {
        this.dbClusterArn = dbClusterArn;
        this.isWriter = isWriter;
    }

    private GlobalClusterGlobalClusterMemberArgs() {
        this.dbClusterArn = Output.empty();
        this.isWriter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterGlobalClusterMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dbClusterArn;
        private @Nullable Output<Boolean> isWriter;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterGlobalClusterMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterArn = defaults.dbClusterArn;
    	      this.isWriter = defaults.isWriter;
        }

        public Builder dbClusterArn(@Nullable Output<String> dbClusterArn) {
            this.dbClusterArn = dbClusterArn;
            return this;
        }

        public Builder dbClusterArn(@Nullable String dbClusterArn) {
            this.dbClusterArn = Output.ofNullable(dbClusterArn);
            return this;
        }

        public Builder isWriter(@Nullable Output<Boolean> isWriter) {
            this.isWriter = isWriter;
            return this;
        }

        public Builder isWriter(@Nullable Boolean isWriter) {
            this.isWriter = Output.ofNullable(isWriter);
            return this;
        }
        public GlobalClusterGlobalClusterMemberArgs build() {
            return new GlobalClusterGlobalClusterMemberArgs(dbClusterArn, isWriter);
        }
    }
}
