// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * RelationshipOccurrence represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 * 
 */
public final class RelationshipOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RelationshipOccurrenceResponse Empty = new RelationshipOccurrenceResponse();

    /**
     * A place for the SPDX file creator to record any general comments about the relationship
     * 
     */
    @InputImport(name="comment", required=true)
      private final String comment;

    public String getComment() {
        return this.comment;
    }

    /**
     * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
     * 
     */
    @InputImport(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are "known unknowns", the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
     * 
     */
    @InputImport(name="target", required=true)
      private final String target;

    public String getTarget() {
        return this.target;
    }

    /**
     * The type of relationship between the source and target SPDX elements
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public RelationshipOccurrenceResponse(
        String comment,
        String source,
        String target,
        String type) {
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RelationshipOccurrenceResponse() {
        this.comment = null;
        this.source = null;
        this.target = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RelationshipOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private String source;
        private String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RelationshipOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RelationshipOccurrenceResponse build() {
            return new RelationshipOccurrenceResponse(comment, source, target, type);
        }
    }
}
