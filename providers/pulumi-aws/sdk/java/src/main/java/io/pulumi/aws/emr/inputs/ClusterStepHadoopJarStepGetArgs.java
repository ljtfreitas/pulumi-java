// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterStepHadoopJarStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterStepHadoopJarStepGetArgs Empty = new ClusterStepHadoopJarStepGetArgs();

    /**
     * List of command line arguments passed to the JAR file's main function when executed.
     * 
     */
    @InputImport(name="args")
    private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * Path to a JAR file run during the step.
     * 
     */
    @InputImport(name="jar", required=true)
    private final Input<String> jar;

    public Input<String> getJar() {
        return this.jar;
    }

    /**
     * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    @InputImport(name="mainClass")
    private final @Nullable Input<String> mainClass;

    public Input<String> getMainClass() {
        return this.mainClass == null ? Input.empty() : this.mainClass;
    }

    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public ClusterStepHadoopJarStepGetArgs(
        @Nullable Input<List<String>> args,
        Input<String> jar,
        @Nullable Input<String> mainClass,
        @Nullable Input<Map<String,String>> properties) {
        this.args = args;
        this.jar = Objects.requireNonNull(jar, "expected parameter 'jar' to be non-null");
        this.mainClass = mainClass;
        this.properties = properties;
    }

    private ClusterStepHadoopJarStepGetArgs() {
        this.args = Input.empty();
        this.jar = Input.empty();
        this.mainClass = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStepHadoopJarStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private Input<String> jar;
        private @Nullable Input<String> mainClass;
        private @Nullable Input<Map<String,String>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStepHadoopJarStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.jar = defaults.jar;
    	      this.mainClass = defaults.mainClass;
    	      this.properties = defaults.properties;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setJar(Input<String> jar) {
            this.jar = Objects.requireNonNull(jar);
            return this;
        }

        public Builder setJar(String jar) {
            this.jar = Input.of(Objects.requireNonNull(jar));
            return this;
        }

        public Builder setMainClass(@Nullable Input<String> mainClass) {
            this.mainClass = mainClass;
            return this;
        }

        public Builder setMainClass(@Nullable String mainClass) {
            this.mainClass = Input.ofNullable(mainClass);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public ClusterStepHadoopJarStepGetArgs build() {
            return new ClusterStepHadoopJarStepGetArgs(args, jar, mainClass, properties);
        }
    }
}
