// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes related incident information for the bookmark
 * 
 */
public final class IncidentInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IncidentInfoResponse Empty = new IncidentInfoResponse();

    /**
     * Incident Id
     * 
     */
    @InputImport(name="incidentId")
        private final @Nullable String incidentId;

    public Optional<String> getIncidentId() {
        return this.incidentId == null ? Optional.empty() : Optional.ofNullable(this.incidentId);
    }

    /**
     * Relation Name
     * 
     */
    @InputImport(name="relationName")
        private final @Nullable String relationName;

    public Optional<String> getRelationName() {
        return this.relationName == null ? Optional.empty() : Optional.ofNullable(this.relationName);
    }

    /**
     * The severity of the incident
     * 
     */
    @InputImport(name="severity")
        private final @Nullable String severity;

    public Optional<String> getSeverity() {
        return this.severity == null ? Optional.empty() : Optional.ofNullable(this.severity);
    }

    /**
     * The title of the incident
     * 
     */
    @InputImport(name="title")
        private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    public IncidentInfoResponse(
        @Nullable String incidentId,
        @Nullable String relationName,
        @Nullable String severity,
        @Nullable String title) {
        this.incidentId = incidentId;
        this.relationName = relationName;
        this.severity = severity;
        this.title = title;
    }

    private IncidentInfoResponse() {
        this.incidentId = null;
        this.relationName = null;
        this.severity = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String incidentId;
        private @Nullable String relationName;
        private @Nullable String severity;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentId = defaults.incidentId;
    	      this.relationName = defaults.relationName;
    	      this.severity = defaults.severity;
    	      this.title = defaults.title;
        }

        public Builder setIncidentId(@Nullable String incidentId) {
            this.incidentId = incidentId;
            return this;
        }

        public Builder setRelationName(@Nullable String relationName) {
            this.relationName = relationName;
            return this;
        }

        public Builder setSeverity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }
        public IncidentInfoResponse build() {
            return new IncidentInfoResponse(incidentId, relationName, severity, title);
        }
    }
}
