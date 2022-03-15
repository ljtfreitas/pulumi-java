// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on regular expressions.
 * 
 */
public final class RegexValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexValidationArgs Empty = new RegexValidationArgs();

    /**
     * RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    @Import(name="regexes", required=true)
      private final Output<List<String>> regexes;

    public Output<List<String>> getRegexes() {
        return this.regexes;
    }

    public RegexValidationArgs(Output<List<String>> regexes) {
        this.regexes = Objects.requireNonNull(regexes, "expected parameter 'regexes' to be non-null");
    }

    private RegexValidationArgs() {
        this.regexes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder regexes(Output<List<String>> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }

        public Builder regexes(List<String> regexes) {
            this.regexes = Output.of(Objects.requireNonNull(regexes));
            return this;
        }
        public RegexValidationArgs build() {
            return new RegexValidationArgs(regexes);
        }
    }
}
