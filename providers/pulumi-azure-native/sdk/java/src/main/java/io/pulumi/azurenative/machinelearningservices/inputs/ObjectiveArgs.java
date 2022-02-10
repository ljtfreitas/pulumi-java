// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.Goal;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ObjectiveArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectiveArgs Empty = new ObjectiveArgs();

    @InputImport(name="goal", required=true)
    private final Input<Either<String,Goal>> goal;

    public Input<Either<String,Goal>> getGoal() {
        return this.goal;
    }

    @InputImport(name="primaryMetric", required=true)
    private final Input<String> primaryMetric;

    public Input<String> getPrimaryMetric() {
        return this.primaryMetric;
    }

    public ObjectiveArgs(
        Input<Either<String,Goal>> goal,
        Input<String> primaryMetric) {
        this.goal = Objects.requireNonNull(goal, "expected parameter 'goal' to be non-null");
        this.primaryMetric = Objects.requireNonNull(primaryMetric, "expected parameter 'primaryMetric' to be non-null");
    }

    private ObjectiveArgs() {
        this.goal = Input.empty();
        this.primaryMetric = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,Goal>> goal;
        private Input<String> primaryMetric;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectiveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goal = defaults.goal;
    	      this.primaryMetric = defaults.primaryMetric;
        }

        public Builder setGoal(Input<Either<String,Goal>> goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }

        public Builder setGoal(Either<String,Goal> goal) {
            this.goal = Input.of(Objects.requireNonNull(goal));
            return this;
        }

        public Builder setPrimaryMetric(Input<String> primaryMetric) {
            this.primaryMetric = Objects.requireNonNull(primaryMetric);
            return this;
        }

        public Builder setPrimaryMetric(String primaryMetric) {
            this.primaryMetric = Input.of(Objects.requireNonNull(primaryMetric));
            return this;
        }

        public ObjectiveArgs build() {
            return new ObjectiveArgs(goal, primaryMetric);
        }
    }
}