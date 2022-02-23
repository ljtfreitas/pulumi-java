// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetQueryDefinitionResult {
    /**
     * Optionally define specific log groups as part of your query definition
     * 
     */
    private final @Nullable List<String> logGroupNames;
    /**
     * A name for the saved query definition
     * 
     */
    private final @Nullable String name;
    /**
     * Unique identifier of a query definition
     * 
     */
    private final @Nullable String queryDefinitionId;
    /**
     * The query string to use for this definition
     * 
     */
    private final @Nullable String queryString;

    @OutputCustomType.Constructor({"logGroupNames","name","queryDefinitionId","queryString"})
    private GetQueryDefinitionResult(
        @Nullable List<String> logGroupNames,
        @Nullable String name,
        @Nullable String queryDefinitionId,
        @Nullable String queryString) {
        this.logGroupNames = logGroupNames;
        this.name = name;
        this.queryDefinitionId = queryDefinitionId;
        this.queryString = queryString;
    }

    /**
     * Optionally define specific log groups as part of your query definition
     * 
     */
    public List<String> getLogGroupNames() {
        return this.logGroupNames == null ? List.of() : this.logGroupNames;
    }
    /**
     * A name for the saved query definition
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Unique identifier of a query definition
     * 
     */
    public Optional<String> getQueryDefinitionId() {
        return Optional.ofNullable(this.queryDefinitionId);
    }
    /**
     * The query string to use for this definition
     * 
     */
    public Optional<String> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> logGroupNames;
        private @Nullable String name;
        private @Nullable String queryDefinitionId;
        private @Nullable String queryString;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupNames = defaults.logGroupNames;
    	      this.name = defaults.name;
    	      this.queryDefinitionId = defaults.queryDefinitionId;
    	      this.queryString = defaults.queryString;
        }

        public Builder setLogGroupNames(@Nullable List<String> logGroupNames) {
            this.logGroupNames = logGroupNames;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setQueryDefinitionId(@Nullable String queryDefinitionId) {
            this.queryDefinitionId = queryDefinitionId;
            return this;
        }

        public Builder setQueryString(@Nullable String queryString) {
            this.queryString = queryString;
            return this;
        }
        public GetQueryDefinitionResult build() {
            return new GetQueryDefinitionResult(logGroupNames, name, queryDefinitionId, queryString);
        }
    }
}
