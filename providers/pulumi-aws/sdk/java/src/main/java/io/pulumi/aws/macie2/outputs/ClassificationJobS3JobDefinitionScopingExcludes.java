// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionScopingExcludesAnd;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionScopingExcludes {
    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
     */
    private final @Nullable List<ClassificationJobS3JobDefinitionScopingExcludesAnd> ands;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionScopingExcludes(@CustomType.Parameter("ands") @Nullable List<ClassificationJobS3JobDefinitionScopingExcludesAnd> ands) {
        this.ands = ands;
    }

    /**
     * An array of conditions, one for each condition that determines which objects to include or exclude from the job. (documented below)
     * 
    */
    public List<ClassificationJobS3JobDefinitionScopingExcludesAnd> getAnds() {
        return this.ands == null ? List.of() : this.ands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClassificationJobS3JobDefinitionScopingExcludesAnd> ands;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
        }

        public Builder ands(@Nullable List<ClassificationJobS3JobDefinitionScopingExcludesAnd> ands) {
            this.ands = ands;
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingExcludes build() {
            return new ClassificationJobS3JobDefinitionScopingExcludes(ands);
        }
    }
}
