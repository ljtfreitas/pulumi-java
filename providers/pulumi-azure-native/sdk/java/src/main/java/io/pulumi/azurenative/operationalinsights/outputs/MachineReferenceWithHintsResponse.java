// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MachineReferenceWithHintsResponse {
    /**
     * Last known display name.
     * 
     */
    private final String displayNameHint;
    /**
     * Resource URI.
     * 
     */
    private final String id;
    /**
     * Specifies the sub-class of the reference.
     * Expected value is 'ref:machinewithhints'.
     * 
     */
    private final String kind;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Last known operating system family.
     * 
     */
    private final String osFamilyHint;
    /**
     * Resource type qualifier.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"displayNameHint","id","kind","name","osFamilyHint","type"})
    private MachineReferenceWithHintsResponse(
        String displayNameHint,
        String id,
        String kind,
        String name,
        String osFamilyHint,
        String type) {
        this.displayNameHint = Objects.requireNonNull(displayNameHint);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.osFamilyHint = Objects.requireNonNull(osFamilyHint);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Last known display name.
     * 
     */
    public String getDisplayNameHint() {
        return this.displayNameHint;
    }
    /**
     * Resource URI.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the sub-class of the reference.
     * Expected value is 'ref:machinewithhints'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Last known operating system family.
     * 
     */
    public String getOsFamilyHint() {
        return this.osFamilyHint;
    }
    /**
     * Resource type qualifier.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineReferenceWithHintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayNameHint;
        private String id;
        private String kind;
        private String name;
        private String osFamilyHint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineReferenceWithHintsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayNameHint = defaults.displayNameHint;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.osFamilyHint = defaults.osFamilyHint;
    	      this.type = defaults.type;
        }

        public Builder setDisplayNameHint(String displayNameHint) {
            this.displayNameHint = Objects.requireNonNull(displayNameHint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOsFamilyHint(String osFamilyHint) {
            this.osFamilyHint = Objects.requireNonNull(osFamilyHint);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MachineReferenceWithHintsResponse build() {
            return new MachineReferenceWithHintsResponse(displayNameHint, id, kind, name, osFamilyHint, type);
        }
    }
}
