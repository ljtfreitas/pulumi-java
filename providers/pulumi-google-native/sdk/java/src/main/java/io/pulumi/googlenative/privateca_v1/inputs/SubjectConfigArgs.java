// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectAltNamesArgs;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * These values are used to create the distinguished name and subject alternative name fields in an X.509 certificate.
 * 
 */
public final class SubjectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectConfigArgs Empty = new SubjectConfigArgs();

    /**
     * Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    @InputImport(name="subject", required=true)
      private final Input<SubjectArgs> subject;

    public Input<SubjectArgs> getSubject() {
        return this.subject;
    }

    /**
     * Optional. The subject alternative name fields.
     * 
     */
    @InputImport(name="subjectAltName")
      private final @Nullable Input<SubjectAltNamesArgs> subjectAltName;

    public Input<SubjectAltNamesArgs> getSubjectAltName() {
        return this.subjectAltName == null ? Input.empty() : this.subjectAltName;
    }

    public SubjectConfigArgs(
        Input<SubjectArgs> subject,
        @Nullable Input<SubjectAltNamesArgs> subjectAltName) {
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = subjectAltName;
    }

    private SubjectConfigArgs() {
        this.subject = Input.empty();
        this.subjectAltName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SubjectArgs> subject;
        private @Nullable Input<SubjectAltNamesArgs> subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder setSubject(Input<SubjectArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubject(SubjectArgs subject) {
            this.subject = Input.of(Objects.requireNonNull(subject));
            return this;
        }

        public Builder setSubjectAltName(@Nullable Input<SubjectAltNamesArgs> subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }

        public Builder setSubjectAltName(@Nullable SubjectAltNamesArgs subjectAltName) {
            this.subjectAltName = Input.ofNullable(subjectAltName);
            return this;
        }
        public SubjectConfigArgs build() {
            return new SubjectConfigArgs(subject, subjectAltName);
        }
    }
}
