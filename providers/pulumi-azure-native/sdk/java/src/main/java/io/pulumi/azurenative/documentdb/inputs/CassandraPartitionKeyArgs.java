// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table partition key
 * 
 */
public final class CassandraPartitionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraPartitionKeyArgs Empty = new CassandraPartitionKeyArgs();

    /**
     * Name of the Cosmos DB Cassandra table partition key
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public CassandraPartitionKeyArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private CassandraPartitionKeyArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraPartitionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraPartitionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public CassandraPartitionKeyArgs build() {
            return new CassandraPartitionKeyArgs(name);
        }
    }
}
