// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application related details of a job posting.
 * 
 */
public final class ApplicationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInfoArgs Empty = new ApplicationInfoArgs();

    /**
     * Use this field to specify email address(es) to which resumes or applications can be sent. The maximum number of allowed characters for each entry is 255.
     * 
     */
    @InputImport(name="emails")
      private final @Nullable Input<List<String>> emails;

    public Input<List<String>> getEmails() {
        return this.emails == null ? Input.empty() : this.emails;
    }

    /**
     * Use this field to provide instructions, such as "Mail your application to ...", that a candidate can follow to apply for the job. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 3,000.
     * 
     */
    @InputImport(name="instruction")
      private final @Nullable Input<String> instruction;

    public Input<String> getInstruction() {
        return this.instruction == null ? Input.empty() : this.instruction;
    }

    /**
     * Use this URI field to direct an applicant to a website, for example to link to an online application form. The maximum number of allowed characters for each entry is 2,000.
     * 
     */
    @InputImport(name="uris")
      private final @Nullable Input<List<String>> uris;

    public Input<List<String>> getUris() {
        return this.uris == null ? Input.empty() : this.uris;
    }

    public ApplicationInfoArgs(
        @Nullable Input<List<String>> emails,
        @Nullable Input<String> instruction,
        @Nullable Input<List<String>> uris) {
        this.emails = emails;
        this.instruction = instruction;
        this.uris = uris;
    }

    private ApplicationInfoArgs() {
        this.emails = Input.empty();
        this.instruction = Input.empty();
        this.uris = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> emails;
        private @Nullable Input<String> instruction;
        private @Nullable Input<List<String>> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.instruction = defaults.instruction;
    	      this.uris = defaults.uris;
        }

        public Builder setEmails(@Nullable Input<List<String>> emails) {
            this.emails = emails;
            return this;
        }

        public Builder setEmails(@Nullable List<String> emails) {
            this.emails = Input.ofNullable(emails);
            return this;
        }

        public Builder setInstruction(@Nullable Input<String> instruction) {
            this.instruction = instruction;
            return this;
        }

        public Builder setInstruction(@Nullable String instruction) {
            this.instruction = Input.ofNullable(instruction);
            return this;
        }

        public Builder setUris(@Nullable Input<List<String>> uris) {
            this.uris = uris;
            return this;
        }

        public Builder setUris(@Nullable List<String> uris) {
            this.uris = Input.ofNullable(uris);
            return this;
        }
        public ApplicationInfoArgs build() {
            return new ApplicationInfoArgs(emails, instruction, uris);
        }
    }
}
