// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalClusterGlobalClusterMember {
    /**
     * Amazon Resource Name (ARN) of member DB Cluster
     * 
     */
    private final @Nullable String dbClusterArn;
    /**
     * Whether the member is the primary DB Cluster
     * 
     */
    private final @Nullable Boolean isWriter;

    @OutputCustomType.Constructor({"dbClusterArn","isWriter"})
    private GlobalClusterGlobalClusterMember(
        @Nullable String dbClusterArn,
        @Nullable Boolean isWriter) {
        this.dbClusterArn = dbClusterArn;
        this.isWriter = isWriter;
    }

    /**
     * Amazon Resource Name (ARN) of member DB Cluster
     * 
     */
    public Optional<String> getDbClusterArn() {
        return Optional.ofNullable(this.dbClusterArn);
    }
    /**
     * Whether the member is the primary DB Cluster
     * 
     */
    public Optional<Boolean> getIsWriter() {
        return Optional.ofNullable(this.isWriter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterGlobalClusterMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dbClusterArn;
        private @Nullable Boolean isWriter;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalClusterGlobalClusterMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterArn = defaults.dbClusterArn;
    	      this.isWriter = defaults.isWriter;
        }

        public Builder setDbClusterArn(@Nullable String dbClusterArn) {
            this.dbClusterArn = dbClusterArn;
            return this;
        }

        public Builder setIsWriter(@Nullable Boolean isWriter) {
            this.isWriter = isWriter;
            return this;
        }
        public GlobalClusterGlobalClusterMember build() {
            return new GlobalClusterGlobalClusterMember(dbClusterArn, isWriter);
        }
    }
}
