// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.TriggerOperation;
import io.pulumi.azurenative.documentdb.enums.TriggerType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL trigger resource object
 * 
 */
public final class SqlTriggerResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlTriggerResourceArgs Empty = new SqlTriggerResourceArgs();

    /**
     * Body of the Trigger
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Name of the Cosmos DB SQL trigger
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * The operation the trigger is associated with
     * 
     */
    @Import(name="triggerOperation")
      private final @Nullable Output<Either<String,TriggerOperation>> triggerOperation;

    public Output<Either<String,TriggerOperation>> getTriggerOperation() {
        return this.triggerOperation == null ? Output.empty() : this.triggerOperation;
    }

    /**
     * Type of the Trigger
     * 
     */
    @Import(name="triggerType")
      private final @Nullable Output<Either<String,TriggerType>> triggerType;

    public Output<Either<String,TriggerType>> getTriggerType() {
        return this.triggerType == null ? Output.empty() : this.triggerType;
    }

    public SqlTriggerResourceArgs(
        @Nullable Output<String> body,
        Output<String> id,
        @Nullable Output<Either<String,TriggerOperation>> triggerOperation,
        @Nullable Output<Either<String,TriggerType>> triggerType) {
        this.body = body;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.triggerOperation = triggerOperation;
        this.triggerType = triggerType;
    }

    private SqlTriggerResourceArgs() {
        this.body = Output.empty();
        this.id = Output.empty();
        this.triggerOperation = Output.empty();
        this.triggerType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlTriggerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> body;
        private Output<String> id;
        private @Nullable Output<Either<String,TriggerOperation>> triggerOperation;
        private @Nullable Output<Either<String,TriggerType>> triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlTriggerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.id = defaults.id;
    	      this.triggerOperation = defaults.triggerOperation;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable String body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder triggerOperation(@Nullable Output<Either<String,TriggerOperation>> triggerOperation) {
            this.triggerOperation = triggerOperation;
            return this;
        }

        public Builder triggerOperation(@Nullable Either<String,TriggerOperation> triggerOperation) {
            this.triggerOperation = Output.ofNullable(triggerOperation);
            return this;
        }

        public Builder triggerType(@Nullable Output<Either<String,TriggerType>> triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public Builder triggerType(@Nullable Either<String,TriggerType> triggerType) {
            this.triggerType = Output.ofNullable(triggerType);
            return this;
        }
        public SqlTriggerResourceArgs build() {
            return new SqlTriggerResourceArgs(body, id, triggerOperation, triggerType);
        }
    }
}
