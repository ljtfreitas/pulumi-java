// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.ThreatIntelligenceParsedPatternTypeValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes parsed pattern entity
 * 
 */
public final class ThreatIntelligenceParsedPatternArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThreatIntelligenceParsedPatternArgs Empty = new ThreatIntelligenceParsedPatternArgs();

    /**
     * Pattern type key
     * 
     */
    @InputImport(name="patternTypeKey")
        private final @Nullable Input<String> patternTypeKey;

    public Input<String> getPatternTypeKey() {
        return this.patternTypeKey == null ? Input.empty() : this.patternTypeKey;
    }

    /**
     * Pattern type keys
     * 
     */
    @InputImport(name="patternTypeValues")
        private final @Nullable Input<List<ThreatIntelligenceParsedPatternTypeValueArgs>> patternTypeValues;

    public Input<List<ThreatIntelligenceParsedPatternTypeValueArgs>> getPatternTypeValues() {
        return this.patternTypeValues == null ? Input.empty() : this.patternTypeValues;
    }

    public ThreatIntelligenceParsedPatternArgs(
        @Nullable Input<String> patternTypeKey,
        @Nullable Input<List<ThreatIntelligenceParsedPatternTypeValueArgs>> patternTypeValues) {
        this.patternTypeKey = patternTypeKey;
        this.patternTypeValues = patternTypeValues;
    }

    private ThreatIntelligenceParsedPatternArgs() {
        this.patternTypeKey = Input.empty();
        this.patternTypeValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThreatIntelligenceParsedPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> patternTypeKey;
        private @Nullable Input<List<ThreatIntelligenceParsedPatternTypeValueArgs>> patternTypeValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ThreatIntelligenceParsedPatternArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.patternTypeKey = defaults.patternTypeKey;
    	      this.patternTypeValues = defaults.patternTypeValues;
        }

        public Builder setPatternTypeKey(@Nullable Input<String> patternTypeKey) {
            this.patternTypeKey = patternTypeKey;
            return this;
        }

        public Builder setPatternTypeKey(@Nullable String patternTypeKey) {
            this.patternTypeKey = Input.ofNullable(patternTypeKey);
            return this;
        }

        public Builder setPatternTypeValues(@Nullable Input<List<ThreatIntelligenceParsedPatternTypeValueArgs>> patternTypeValues) {
            this.patternTypeValues = patternTypeValues;
            return this;
        }

        public Builder setPatternTypeValues(@Nullable List<ThreatIntelligenceParsedPatternTypeValueArgs> patternTypeValues) {
            this.patternTypeValues = Input.ofNullable(patternTypeValues);
            return this;
        }
        public ThreatIntelligenceParsedPatternArgs build() {
            return new ThreatIntelligenceParsedPatternArgs(patternTypeKey, patternTypeValues);
        }
    }
}
