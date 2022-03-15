// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationLogPatternArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The log pattern set.
 * 
 */
public final class ApplicationLogPatternSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationLogPatternSetArgs Empty = new ApplicationLogPatternSetArgs();

    /**
     * The log patterns of a set.
     * 
     */
    @Import(name="logPatterns", required=true)
      private final Output<List<ApplicationLogPatternArgs>> logPatterns;

    public Output<List<ApplicationLogPatternArgs>> getLogPatterns() {
        return this.logPatterns;
    }

    /**
     * The name of the log pattern set.
     * 
     */
    @Import(name="patternSetName", required=true)
      private final Output<String> patternSetName;

    public Output<String> getPatternSetName() {
        return this.patternSetName;
    }

    public ApplicationLogPatternSetArgs(
        Output<List<ApplicationLogPatternArgs>> logPatterns,
        Output<String> patternSetName) {
        this.logPatterns = Objects.requireNonNull(logPatterns, "expected parameter 'logPatterns' to be non-null");
        this.patternSetName = Objects.requireNonNull(patternSetName, "expected parameter 'patternSetName' to be non-null");
    }

    private ApplicationLogPatternSetArgs() {
        this.logPatterns = Output.empty();
        this.patternSetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ApplicationLogPatternArgs>> logPatterns;
        private Output<String> patternSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logPatterns = defaults.logPatterns;
    	      this.patternSetName = defaults.patternSetName;
        }

        public Builder logPatterns(Output<List<ApplicationLogPatternArgs>> logPatterns) {
            this.logPatterns = Objects.requireNonNull(logPatterns);
            return this;
        }

        public Builder logPatterns(List<ApplicationLogPatternArgs> logPatterns) {
            this.logPatterns = Output.of(Objects.requireNonNull(logPatterns));
            return this;
        }

        public Builder patternSetName(Output<String> patternSetName) {
            this.patternSetName = Objects.requireNonNull(patternSetName);
            return this;
        }

        public Builder patternSetName(String patternSetName) {
            this.patternSetName = Output.of(Objects.requireNonNull(patternSetName));
            return this;
        }
        public ApplicationLogPatternSetArgs build() {
            return new ApplicationLogPatternSetArgs(logPatterns, patternSetName);
        }
    }
}
