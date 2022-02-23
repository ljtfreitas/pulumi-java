// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingIncludesAnd;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClassificationJobS3JobDefinitionScopingIncludes {
    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    private final @Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAnd> ands;

    @OutputCustomType.Constructor({"ands"})
    private ClassificationJobS3JobDefinitionScopingIncludes(@Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAnd> ands) {
        this.ands = ands;
    }

    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    public List<ClassificationJobS3JobDefinitionScopingIncludesAnd> getAnds() {
        return this.ands == null ? List.of() : this.ands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAnd> ands;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
        }

        public Builder setAnds(@Nullable List<ClassificationJobS3JobDefinitionScopingIncludesAnd> ands) {
            this.ands = ands;
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingIncludes build() {
            return new ClassificationJobS3JobDefinitionScopingIncludes(ands);
        }
    }
}
