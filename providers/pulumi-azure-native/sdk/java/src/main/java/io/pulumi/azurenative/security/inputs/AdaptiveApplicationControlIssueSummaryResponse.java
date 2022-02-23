// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a summary of the alerts of the machine group
 * 
 */
public final class AdaptiveApplicationControlIssueSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdaptiveApplicationControlIssueSummaryResponse Empty = new AdaptiveApplicationControlIssueSummaryResponse();

    /**
     * An alert that machines within a group can have
     * 
     */
    @InputImport(name="issue")
        private final @Nullable String issue;

    public Optional<String> getIssue() {
        return this.issue == null ? Optional.empty() : Optional.ofNullable(this.issue);
    }

    /**
     * The number of machines in the group that have this alert
     * 
     */
    @InputImport(name="numberOfVms")
        private final @Nullable Double numberOfVms;

    public Optional<Double> getNumberOfVms() {
        return this.numberOfVms == null ? Optional.empty() : Optional.ofNullable(this.numberOfVms);
    }

    public AdaptiveApplicationControlIssueSummaryResponse(
        @Nullable String issue,
        @Nullable Double numberOfVms) {
        this.issue = issue;
        this.numberOfVms = numberOfVms;
    }

    private AdaptiveApplicationControlIssueSummaryResponse() {
        this.issue = null;
        this.numberOfVms = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdaptiveApplicationControlIssueSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String issue;
        private @Nullable Double numberOfVms;

        public Builder() {
    	      // Empty
        }

        public Builder(AdaptiveApplicationControlIssueSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issue = defaults.issue;
    	      this.numberOfVms = defaults.numberOfVms;
        }

        public Builder setIssue(@Nullable String issue) {
            this.issue = issue;
            return this;
        }

        public Builder setNumberOfVms(@Nullable Double numberOfVms) {
            this.numberOfVms = numberOfVms;
            return this;
        }
        public AdaptiveApplicationControlIssueSummaryResponse build() {
            return new AdaptiveApplicationControlIssueSummaryResponse(issue, numberOfVms);
        }
    }
}
