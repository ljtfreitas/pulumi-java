// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobCommandGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobCommandGetArgs Empty = new JobCommandGetArgs();

    /**
     * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `max_capacity` needs to be set if `pythonshell` is chosen.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * 
     */
    @Import(name="pythonVersion")
      private final @Nullable Output<String> pythonVersion;

    public Output<String> getPythonVersion() {
        return this.pythonVersion == null ? Output.empty() : this.pythonVersion;
    }

    /**
     * Specifies the S3 path to a script that executes a job.
     * 
     */
    @Import(name="scriptLocation", required=true)
      private final Output<String> scriptLocation;

    public Output<String> getScriptLocation() {
        return this.scriptLocation;
    }

    public JobCommandGetArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> pythonVersion,
        Output<String> scriptLocation) {
        this.name = name;
        this.pythonVersion = pythonVersion;
        this.scriptLocation = Objects.requireNonNull(scriptLocation, "expected parameter 'scriptLocation' to be non-null");
    }

    private JobCommandGetArgs() {
        this.name = Output.empty();
        this.pythonVersion = Output.empty();
        this.scriptLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCommandGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> pythonVersion;
        private Output<String> scriptLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCommandGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.scriptLocation = defaults.scriptLocation;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder pythonVersion(@Nullable Output<String> pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }

        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = Output.ofNullable(pythonVersion);
            return this;
        }

        public Builder scriptLocation(Output<String> scriptLocation) {
            this.scriptLocation = Objects.requireNonNull(scriptLocation);
            return this;
        }

        public Builder scriptLocation(String scriptLocation) {
            this.scriptLocation = Output.of(Objects.requireNonNull(scriptLocation));
            return this;
        }
        public JobCommandGetArgs build() {
            return new JobCommandGetArgs(name, pythonVersion, scriptLocation);
        }
    }
}
