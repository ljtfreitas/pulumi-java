// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesAndArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesArgs();

    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    @InputImport(name="ands")
    private final @Nullable Input<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands;

    public Input<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> getAnds() {
        return this.ands == null ? Input.empty() : this.ands;
    }

    public ClassificationJobS3JobDefinitionScopingIncludesArgs(@Nullable Input<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands) {
        this.ands = ands;
    }

    private ClassificationJobS3JobDefinitionScopingIncludesArgs() {
        this.ands = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
        }

        public Builder setAnds(@Nullable Input<List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs>> ands) {
            this.ands = ands;
            return this;
        }

        public Builder setAnds(@Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAndArgs> ands) {
            this.ands = Input.ofNullable(ands);
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingIncludesArgs build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesArgs(ands);
        }
    }
}
