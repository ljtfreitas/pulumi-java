// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Default options to interpret user query.
 * 
 */
public final class QueryInterpretationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryInterpretationConfigResponse Empty = new QueryInterpretationConfigResponse();

    /**
     * Set this flag to disable supplemental results retrieval, setting a flag here will not retrieve supplemental results for queries associated with a given search application. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for supplemental results.
     * 
     */
    @Import(name="forceDisableSupplementalResults", required=true)
      private final Boolean forceDisableSupplementalResults;

    public Boolean getForceDisableSupplementalResults() {
        return this.forceDisableSupplementalResults;
    }

    /**
     * Enable this flag to turn off all internal optimizations like natural language (NL) interpretation of queries, supplemental results retrieval, and usage of synonyms including custom ones. If this flag is set to True, it will take precedence over the option set at Query level. For the default value of False, query level flag will set the correct interpretation for verbatim mode.
     * 
     */
    @Import(name="forceVerbatimMode", required=true)
      private final Boolean forceVerbatimMode;

    public Boolean getForceVerbatimMode() {
        return this.forceVerbatimMode;
    }

    public QueryInterpretationConfigResponse(
        Boolean forceDisableSupplementalResults,
        Boolean forceVerbatimMode) {
        this.forceDisableSupplementalResults = Objects.requireNonNull(forceDisableSupplementalResults, "expected parameter 'forceDisableSupplementalResults' to be non-null");
        this.forceVerbatimMode = Objects.requireNonNull(forceVerbatimMode, "expected parameter 'forceVerbatimMode' to be non-null");
    }

    private QueryInterpretationConfigResponse() {
        this.forceDisableSupplementalResults = null;
        this.forceVerbatimMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryInterpretationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean forceDisableSupplementalResults;
        private Boolean forceVerbatimMode;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryInterpretationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceDisableSupplementalResults = defaults.forceDisableSupplementalResults;
    	      this.forceVerbatimMode = defaults.forceVerbatimMode;
        }

        public Builder forceDisableSupplementalResults(Boolean forceDisableSupplementalResults) {
            this.forceDisableSupplementalResults = Objects.requireNonNull(forceDisableSupplementalResults);
            return this;
        }

        public Builder forceVerbatimMode(Boolean forceVerbatimMode) {
            this.forceVerbatimMode = Objects.requireNonNull(forceVerbatimMode);
            return this;
        }
        public QueryInterpretationConfigResponse build() {
            return new QueryInterpretationConfigResponse(forceDisableSupplementalResults, forceVerbatimMode);
        }
    }
}
