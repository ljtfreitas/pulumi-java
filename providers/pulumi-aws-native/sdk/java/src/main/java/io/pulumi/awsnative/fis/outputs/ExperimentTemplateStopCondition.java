// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.fis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExperimentTemplateStopCondition {
    private final String source;
    private final @Nullable String value;

    @CustomType.Constructor
    private ExperimentTemplateStopCondition(
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("value") @Nullable String value) {
        this.source = source;
        this.value = value;
    }

    public String getSource() {
        return this.source;
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateStopCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String source;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTemplateStopCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
    	      this.value = defaults.value;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ExperimentTemplateStopCondition build() {
            return new ExperimentTemplateStopCondition(source, value);
        }
    }
}
