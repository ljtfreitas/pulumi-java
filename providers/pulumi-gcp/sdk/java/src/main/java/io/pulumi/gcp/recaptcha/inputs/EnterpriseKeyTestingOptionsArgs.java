// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyTestingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyTestingOptionsArgs Empty = new EnterpriseKeyTestingOptionsArgs();

    /**
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if UNSOLVABLE_CHALLENGE. Possible values: TESTING_CHALLENGE_UNSPECIFIED, NOCAPTCHA, UNSOLVABLE_CHALLENGE
     * 
     */
    @Import(name="testingChallenge")
      private final @Nullable Output<String> testingChallenge;

    public Output<String> getTestingChallenge() {
        return this.testingChallenge == null ? Output.empty() : this.testingChallenge;
    }

    /**
     * All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
     * 
     */
    @Import(name="testingScore")
      private final @Nullable Output<Double> testingScore;

    public Output<Double> getTestingScore() {
        return this.testingScore == null ? Output.empty() : this.testingScore;
    }

    public EnterpriseKeyTestingOptionsArgs(
        @Nullable Output<String> testingChallenge,
        @Nullable Output<Double> testingScore) {
        this.testingChallenge = testingChallenge;
        this.testingScore = testingScore;
    }

    private EnterpriseKeyTestingOptionsArgs() {
        this.testingChallenge = Output.empty();
        this.testingScore = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyTestingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> testingChallenge;
        private @Nullable Output<Double> testingScore;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyTestingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testingChallenge = defaults.testingChallenge;
    	      this.testingScore = defaults.testingScore;
        }

        public Builder testingChallenge(@Nullable Output<String> testingChallenge) {
            this.testingChallenge = testingChallenge;
            return this;
        }

        public Builder testingChallenge(@Nullable String testingChallenge) {
            this.testingChallenge = Output.ofNullable(testingChallenge);
            return this;
        }

        public Builder testingScore(@Nullable Output<Double> testingScore) {
            this.testingScore = testingScore;
            return this;
        }

        public Builder testingScore(@Nullable Double testingScore) {
            this.testingScore = Output.ofNullable(testingScore);
            return this;
        }
        public EnterpriseKeyTestingOptionsArgs build() {
            return new EnterpriseKeyTestingOptionsArgs(testingChallenge, testingScore);
        }
    }
}
