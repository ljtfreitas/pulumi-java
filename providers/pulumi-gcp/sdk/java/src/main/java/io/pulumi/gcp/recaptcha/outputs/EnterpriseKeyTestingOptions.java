// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseKeyTestingOptions {
    private final @Nullable String testingChallenge;
    private final @Nullable Double testingScore;

    @OutputCustomType.Constructor({"testingChallenge","testingScore"})
    private EnterpriseKeyTestingOptions(
        @Nullable String testingChallenge,
        @Nullable Double testingScore) {
        this.testingChallenge = testingChallenge;
        this.testingScore = testingScore;
    }

    public Optional<String> getTestingChallenge() {
        return Optional.ofNullable(this.testingChallenge);
    }
    public Optional<Double> getTestingScore() {
        return Optional.ofNullable(this.testingScore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyTestingOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String testingChallenge;
        private @Nullable Double testingScore;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyTestingOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testingChallenge = defaults.testingChallenge;
    	      this.testingScore = defaults.testingScore;
        }

        public Builder setTestingChallenge(@Nullable String testingChallenge) {
            this.testingChallenge = testingChallenge;
            return this;
        }

        public Builder setTestingScore(@Nullable Double testingScore) {
            this.testingScore = testingScore;
            return this;
        }

        public EnterpriseKeyTestingOptions build() {
            return new EnterpriseKeyTestingOptions(testingChallenge, testingScore);
        }
    }
}