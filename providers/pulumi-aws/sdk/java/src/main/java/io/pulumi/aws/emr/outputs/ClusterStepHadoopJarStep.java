// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterStepHadoopJarStep {
    /**
     * List of command line arguments passed to the JAR file's main function when executed.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * Path to a JAR file run during the step.
     * 
     */
    private final String jar;
    /**
     * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    private final @Nullable String mainClass;
    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    private final @Nullable Map<String,String> properties;

    @CustomType.Constructor
    private ClusterStepHadoopJarStep(
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("jar") String jar,
        @CustomType.Parameter("mainClass") @Nullable String mainClass,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties) {
        this.args = args;
        this.jar = jar;
        this.mainClass = mainClass;
        this.properties = properties;
    }

    /**
     * List of command line arguments passed to the JAR file's main function when executed.
     * 
    */
    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * Path to a JAR file run during the step.
     * 
    */
    public String getJar() {
        return this.jar;
    }
    /**
     * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
    */
    public Optional<String> getMainClass() {
        return Optional.ofNullable(this.mainClass);
    }
    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStepHadoopJarStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private String jar;
        private @Nullable String mainClass;
        private @Nullable Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStepHadoopJarStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.jar = defaults.jar;
    	      this.mainClass = defaults.mainClass;
    	      this.properties = defaults.properties;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder jar(String jar) {
            this.jar = Objects.requireNonNull(jar);
            return this;
        }

        public Builder mainClass(@Nullable String mainClass) {
            this.mainClass = mainClass;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public ClusterStepHadoopJarStep build() {
            return new ClusterStepHadoopJarStep(args, jar, mainClass, properties);
        }
    }
}
